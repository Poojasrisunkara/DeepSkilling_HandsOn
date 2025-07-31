import React, { useState } from "react";

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("Euro");

  const handleIncrement = () => {
    incrementCounter();
    sayHello();
  };

  const incrementCounter = () => setCount(count + 1);
  const sayHello = () => alert("Hello! This is a static message.");
  const handleDecrement = () => setCount(count - 1);
  const sayWelcome = (msg) => alert(msg);
  const handleClickSynthetic = () => alert("I was clicked");

  const handleSubmit = (e) => {
    e.preventDefault();
    if (amount === "" || isNaN(amount)) {
      alert("Please enter a valid amount");
      return;
    }
    const amt = parseFloat(amount);
    const rate = 0.011;
    if (currency.toLowerCase() === "euro" || currency.toLowerCase() === "eur") {
      alert(`${amt} INR = ${(amt * rate).toFixed(2)} EUR`);
    } else if (currency.toLowerCase() === "inr") {
      alert(`${amt} EUR = ${(amt / rate).toFixed(2)} INR`);
    } else {
      alert("Currency must be INR or Euro.");
    }
  };

  return (
    <div style={{ textAlign: "center", padding: "20px" }}>
      <h1>Event Examples App</h1>
      <h2>Counter: {count}</h2>
      <div style={{ display: "flex", flexDirection: "column", alignItems: "center", gap: "10px" }}>
        <button onClick={handleIncrement}>Increment</button>
        <button onClick={handleDecrement}>Decrement</button>
        <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>
        <button onClick={handleClickSynthetic}>Click on me</button>
      </div>
      <h2 style={{ color: "green", marginTop: "20px" }}>Currency Converter!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div style={{ marginTop: "10px" }}>
          <label>Currency: </label>
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>
        <div style={{ marginTop: "10px" }}>
          <button type="submit">Convert</button>
        </div>
      </form>
    </div>
  );
}

export default App;


