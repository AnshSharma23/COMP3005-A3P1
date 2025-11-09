import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/a3p1";
        String user = "postgres";
        String password = "pgadmin";
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            if(connection != null){
                System.out.println("Connected\n");
            }
        }catch(Exception e){
            System.out.println("Failed to connect");
        };

        //CHANGE VALUES HERE AND CALL FUNCTIONS (where the CRUD functions are called)
        //getAllStudents(); //Before table
        //addStudents("h", "h","ww@email.ca", "2025-12-01"); //Will add a new student with a first name, last name, email and an enrollment date
        //updateStudentEmail(9, "9email@cmail.ca"); //Uses a student's id to find them and update their email
        //deleteStudent(11); //Removes the student using their id
        //getAllStudents(); //After table
    }

    public static void getAllStudents(){
        String url = "jdbc:postgresql://localhost:5432/a3p1";
        String user = "postgres";
        String password = "pgadmin";
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM students;"); //SELECT statement
            ResultSet resultSet = statement.getResultSet();
            //Loops and prints contents
            while(resultSet.next()){
                System.out.println("Student ID: " + resultSet.getString("student_id"));
                System.out.println("First Name: " + resultSet.getString("first_name"));
                System.out.println("Last Name: " + resultSet.getString("last_name"));
                System.out.println("Email: " + resultSet.getString("email"));
                System.out.println("Enrollment Date: " + resultSet.getString("enrollment_date") + "\n");
            }
        }catch(Exception e){
            System.out.println("Cannot get all students (Cannot add)");
        };
    }

    public static void addStudents(String first_name, String last_name, String email, String enrollment_date){
        String url = "jdbc:postgresql://localhost:5432/a3p1";
        String user = "postgres";
        String password = "pgadmin";
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO students (first_name, last_name, email, enrollment_date) VALUES ('"+first_name+"', '"+last_name+"', '"+email+"', '"+enrollment_date+"');"); //INSERT statement
            //ResultSet resultSet = statement.getResultSet();
            System.out.println("Inserted Successfully\n");
        }catch(Exception e){
            System.out.println("Cannot add new student");
            System.out.println(e);
        };
    }

    public static void updateStudentEmail(int student_id, String email){
        String url = "jdbc:postgresql://localhost:5432/a3p1";
        String user = "postgres";
        String password = "pgadmin";
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.execute("UPDATE students SET email='"+email+"' WHERE student_id='"+student_id+"';"); //UPDATE STATEMENT
            //ResultSet resultSet = statement.getResultSet();
            System.out.println("Email Updated Successfully");
        }catch(Exception e){
            System.out.println("Cannot update student's email");
            System.out.println(e);
        };
    }

    public static void deleteStudent(int student_id){
        String url = "jdbc:postgresql://localhost:5432/a3p1";
        String user = "postgres";
        String password = "pgadmin";
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM students WHERE student_id='"+student_id+"';"); //DELETE statement
            //ResultSet resultSet = statement.getResultSet();
            System.out.println("Deleted Successfully\n");
        }catch(Exception e){
            System.out.println("Cannot remove the student");
            System.out.println(e);
        };
    }
}