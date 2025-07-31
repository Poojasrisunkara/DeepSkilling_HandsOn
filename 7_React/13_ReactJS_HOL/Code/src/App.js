import React, { useState } from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";
import "./App.css";

function App() {
  const [show, setShow] = useState("books");

  const books = [
    { id: 101, bname: "Master React", price: 670 },
    { id: 102, bname: "Deep Dive into Angular 11", price: 800 },
    { id: 103, bname: "MongoDB Fast Track", price: 450 },
  ];

  const blogs = [
    { id: 201, title: "React Basics", content: "Learn components, hooks and props." },
    { id: 202, title: "Node.js Guide", content: "Server-side JS made easy." },
  ];

  const courses = [
    { id: 301, cname: "Full Stack Development", price: 1200 },
    { id: 302, cname: "React", price: 900 },
  ];

  return (
    <div className="App">
      <h1>Welcome to BloggerApp</h1>

      <button onClick={() => setShow("books")}>Show Books</button>
      <button onClick={() => setShow("blogs")}>Show Blogs</button>
      <button onClick={() => setShow("courses")}>Show Courses</button>

      {show === "books" ? (
        <BookDetails books={books} />
      ) : show === "blogs" ? (
        <BlogDetails blogs={blogs} />
      ) : (
        <CourseDetails courses={courses} />
      )}

      {show === "books" && <p>We are currently viewing Book Details.</p>}

      <p>{show === "courses" ? "Explore Our Courses Below!" : "Browse Books or Blogs."}</p>
    </div>
  );
}

export default App;

