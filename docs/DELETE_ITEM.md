**Delete Item**
----
Deletes an individual item.

* **URL**

  /item/:id


* **Method:**

  `DELETE`


* **Path Param:**

  `id=[integer]`


* **Success Response:**

    * **Code:** 200 <br />


* **Error Response:**

    * **Code:** 404 <br/>
  Thrown if id is invalid. 


* **Sample Call:**

  `curl --location --request DELETE 'http://localhost:3000/item/1`