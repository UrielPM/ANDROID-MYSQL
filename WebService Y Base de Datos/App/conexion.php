<?php
$hostname='localhost';
$database ='App';
$username='root';
$password='';

$conexion=new mysqli($hostname,$username,$password,$database);
if ($conexion->connect_errno) {
echo "Algo salio mal";
}
?>

