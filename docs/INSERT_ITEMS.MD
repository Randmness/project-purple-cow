**Insert Items**
----
Allows insertion of one (or more) items

* **URL**

  /item


* **Method:**

  `POST`


* **Data Params:**
  
    JSON array of objects (1 or more)
    * name: new item name

  `[{"name" : "Sprite"},
  {"name": "Coke Zero"}]`
  

* **Success Response:**

    * **Code:** 200 <br />


* **Sample Call:**

  `curl --location --request POST 'http://localhost:3000/item' \
  --header 'Content-Type: application/json' \
  --data-raw '[
  {"name" : "Sprite"},
  {"name": "Coke Zero"}
  ]'`