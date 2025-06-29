CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    dept IN VARCHAR2,
    bonus_percent IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE Department = dept;

    DBMS_OUTPUT.PUT_LINE('Bonus applied to department: ' || dept);
END;
/
-- To test
BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/
