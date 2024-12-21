<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "crudapp";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Fetch data from external API (example: JSONPlaceholder API)
$api_url = "https://jsonplaceholder.typicode.com/users";
$data = file_get_contents($api_url);
$users = json_decode($data, true);

// Insert data into MySQL database
foreach ($users as $user) {
    $name = $user['name'];
    $email = $user['email'];

    $sql = "INSERT INTO users (name, email) VALUES ('$name', '$email')";
    $conn->query($sql);
}

echo "Data fetched and stored successfully!";
$conn->close();
?>
