window.onload = function() {
    const msg = successMessage?.trim() || errorMessage?.trim();
    const color = successMessage ? "green" : errorMessage ? "red" : null;

    if (msg && color) showAlert(msg, color);
};

function showAlert(msg, color) {
    const alertDiv = document.createElement("div");
    alertDiv.innerText = msg;
    Object.assign(alertDiv.style, {
        position: "fixed",
        top: "20px",
        left: "50%",
        transform: "translateX(-50%)",
        backgroundColor: color === "green" ? "#d4edda" : "#f8d7da",
        color: color === "green" ? "#155724" : "#721c24",
        padding: "15px 25px",
        border: "1px solid",
        borderColor: color === "green" ? "#c3e6cb" : "#f5c6cb",
        borderRadius: "5px",
        zIndex: "1000",
        boxShadow: "0 2px 10px rgba(0,0,0,0.2)",
        fontFamily: "Arial, sans-serif"
    });

    document.body.appendChild(alertDiv);
    setTimeout(() => alertDiv.remove(), 3000);
}
