CREATE OR REPLACE PROCEDURE TransferFunds (
    sourceAccID IN NUMBER,
    destAccID IN NUMBER,
    amount IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = sourceAccID FOR UPDATE;

    IF v_balance < amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in Account ID: ' || sourceAccID);
    ELSE
        UPDATE Accounts
        SET Balance = Balance - amount, LastModified = SYSDATE
        WHERE AccountID = sourceAccID;

        UPDATE Accounts
        SET Balance = Balance + amount, LastModified = SYSDATE
        WHERE AccountID = destAccID;

        DBMS_OUTPUT.PUT_LINE('Transferred ' || amount || ' from Account ' || sourceAccID || 
                             ' to Account ' || destAccID);
    END IF;
END;
/
BEGIN
    TransferFunds(1, 2, 100);
END;
/
