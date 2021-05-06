**Update Item**
----
Updates an individual item.

* **URL**

  /item/:id


* **Method:**

  `PUT`


* **Path Param:**

  `id=[integer]`


* **Data Params:**
  * name: new item name

  `{"name": "Dr. Pepper"}`


* **Success Response:**

    * **Code:** 200 <br />
      **Content:** <br/>`{ id : 12, name : "Dr. Pepper" }`
      

* **Error Response:**

    * **Code:** 404 <br/>
      Thrown if id is invalid.


* **Sample Call:**

  `curl --location --request PUT 'http://localhost:3000/item/1' \
  --header 'Content-Type: application/json' \
  --data-raw '{"name": "Dr. Pepper"}'`