DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID, TRUNC(MONTHS_BETWEEN(SYSDATE, DOB)/12) AS Age
        FROM Customers;
    v_customer_id Customers.CustomerID%TYPE;
    v_age NUMBER;
BEGIN
    FOR rec IN cust_cursor LOOP
        v_customer_id := rec.CustomerID;
        v_age := rec.Age;

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = v_customer_id;

            DBMS_OUTPUT.PUT_LINE('1% interest discount applied for Customer ID: ' || v_customer_id);
        END IF;
    END LOOP;
END;
/
