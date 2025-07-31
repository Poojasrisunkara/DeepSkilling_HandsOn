
import React from "react";

const BlogDetails = ({ blogs }) => {
  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {blogs.length > 0 ? (
        blogs.map((blog) => (
          <div key={blog.id}>
            <h3>{blog.title}</h3>
            <p>{blog.content}</p>
          </div>
        ))
      ) : (
        <p>No Blogs Available.</p>
      )}
    </div>
  );
};

export default BlogDetails;
