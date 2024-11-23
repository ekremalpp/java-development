-- Question 1 
SELECT UnitPrice
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
		FROM products);



-- Question 2
SELECT Orders.OrderID, Orders.ShipName, Orders.ShipAddress
From orders
Where Orders.ShipVia = ( SELECT ShipperID
						FROM shippers
                        WHERE CompanyName = 'Federal Shipping'
                        );



-- Question 3 




-- Question 4 



-- Question 5 