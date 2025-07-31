
import React from "react";

const BookDetails = ({ books }) => {
  const bookList = (
    <ul>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>Price: ₹{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="st2">
      <h1>Book Details</h1>
      {bookList}
    </div>
  );
};

export default BookDetails;
