package myPackage;

public class Query {
	static String insert="INSERT INTO employee VALUES(?,?,?,?)";
	static String update="UPDATE employee SET id =? WHERE name= ?";
	static String delete="DELETE FROM employee WHERE id =?";
	static String select="SELECT * FROM employee";

}
