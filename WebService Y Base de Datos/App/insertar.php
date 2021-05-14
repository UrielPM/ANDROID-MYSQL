<?php
include 'conexion.php';
$codigo=$_POST['codigo'];
$nombre=$_POST['nombre'];
$precio=$_POST['precio'];

$consulta="INSERT INTO Producto (codigo, nombre, precio) VALUES('".$codigo."', '".$nombre."', '".$precio."')";
mysqli_query($conexion, $consulta) or die(mysqli_errno);
mysqli_close($conexion);



