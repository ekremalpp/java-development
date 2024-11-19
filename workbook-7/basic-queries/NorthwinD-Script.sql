-- Question 1: products


-- Question 2: 
SELECT productid, productname, unitprice
FROM products; 



-- Question 3:
SELECT productid, productname, unitprice
from products
 ORDER BY unitprice;




-- Question 4:
SELECT unitprice
FROM products
where unitprice <= 7.50;




-- Question 5:
SELECT *
FROM products
WHERE unitsinstock >=100
ORDER BY unitprice DESC;




-- Question 6:
SELECT *
FROM products
WHERE unitsinstock >=100
ORDER BY unitprice DESC, productname;



-- Question 7:
SELECT *
FROM products
where UnitsInStock = 0 and unitsonorder > 0
order by ProductName;


-- Question 8:



-- Question 9:



-- Question 10:




-- Question 11:



-- Question 12:




-- Question 13:





-- Question 14:




