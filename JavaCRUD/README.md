เข้าไปโฟลเเดอร์ปัจจบัน
cd d:\!ford\programming\projectjava
d:

javac <ชื่อไฟล์>.java
java <ชื่อไฟล์>

----------------------------------------------------------------------

javac -cp ".;..\lib\mysql-connector-j-26.10.0.jar" db\DBConnection.java model\Student.java dao\StudentDAO.java main\Main.java
java -cp ".;..\lib\mysql-connector-j-26.10.0.jar" main.Main 