

**Project topic:** Website for order acceptance in the wholesale market.

**Project idea:** Create a website for the wholesale market so that customers 
can order their products remotely.

**Project description:** A client can look at the itemsList and choose best way for wholesale looking for cost. Clients can create order with choosed item, then created order accepts by operators. Operators will give this order to complete.

**We have 5 beans:** Admin, User, Operator, Item, Order.

**Planned functionalities:**
    
    -User can look at items list
    -User can look at items with filter
    -User can order items
    
    -Operator can accept order
    -Operator can look who ordered
    -Operator can check itemResidue
    -Operator can look Users list

    -Admin can block/unblock user by his phone number
    -Admin can add/change item to DB
    -Admin can make User a Operator
    -Admin can look Users list
    -Admin can look Operators list
    -Admin can look Orders list
    -Admin can look Item list

**First week, Laboratory work #1:**
    
    Created 2 beans: Item and User
    Done 2 functionalities: 
         -User can look at items list
         -User can look at items with filter
         -Look at Users list
         -Look at Operator list




curl --location --request POST 'http://localhost:8080/api/operator/' \
--header 'Content-Type: application/json' \
--data-raw '{
"id": 0,
"login": "string",
"password": "string"
}'

