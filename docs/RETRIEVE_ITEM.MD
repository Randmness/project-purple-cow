**Retrieve Item**
----
Returns an individual item.

* **URL**

  /item/:id


* **Method:**

  `GET`


* **Path Param:**

  `id=[integer]`


* **Success Response:**

    * **Code:** 200 <br />
      **Content:** `{ id : 12, name : "Soda" }`


* **Error Response:**

    * **Code:** 404 <br/>
      Thrown if id is invalid.


* **Sample Call:**

  `curl --location --request GET 'http://localhost:3000/item/1`