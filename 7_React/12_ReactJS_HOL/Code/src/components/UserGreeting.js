function UserGreeting() {
  return (
    <div>
      <h2>Welcome Back, User!</h2>
      <h3>Available Flights:</h3>
      <ul>
        <li>Flight A123 - Delhi to Mumbai - ₹4500 <button>Book Now</button></li>
        <li>Flight B456 - Bangalore to Chennai - ₹3500 <button>Book Now</button></li>
        <li>Flight C789 - Hyderabad to Pune - ₹4000 <button>Book Now</button></li>
      </ul>
    </div>
  );
}

export default UserGreeting;
