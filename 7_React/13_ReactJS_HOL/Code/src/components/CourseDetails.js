
import React from "react";

const CourseDetails = ({ courses }) => {
  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {courses.length ? (
        courses.map((course) => (
          <div key={course.id}>
            <h3>{course.cname}</h3>
            <h4>Price: ₹{course.price}</h4>
          </div>
        ))
      ) : (
        <p>No Courses Found.</p>
      )}
    </div>
  );
};

export default CourseDetails;
