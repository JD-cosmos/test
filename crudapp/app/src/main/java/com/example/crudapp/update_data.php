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

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $id = $_POST['id'];
    $name = $_POST['name'];
    $email = $_POST['email'];

    $sql = "UPDATE users SET name='$name', email='$email' WHERE id=$id";

    if ($conn->query($sql) === TRUE) {
        echo "Record updated successfully!";
    } else {
        echo "Error updating record: " . $conn->error;
    }
}

$conn->close();
?>
