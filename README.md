# COMP3005-A3P1
# Ansh Sharma (101327077)

#Steps to import
1. Download the src folder off the github
2. Create a new IntelliJ project with the Maven archetype
3. Ensure that an SDK compatible with the libraries are used (SDK 22 or 24 should work, 19 doesn't)
4. Create new project and Import the src file into the project directory
5. Go to pom.xml and add dependency based on the java version https://jdbc.postgresql.org/download/ from this site (click "Copy Maven" and add it) like what was done on the brightspace video about using JDBC.

#Steps to run
1. Go to Main/Java/Main.java in the src folder
2. At the top of each function, there will be the url (database url), username (postgres username), and password (postgres password) to connect to the SQL database in pgAdmin4. Changes these as needed. This should be different based on your postgres setup. The video demo on brightspace shows how to do this.
3. Once everything has been changed, it should connect to your database. If it doesn't connect, it should state "Failed to connect".
4. Now the methods within the main function can be changed accordingly. These are where the SQL statements are called. Change the parameters to whatever operation you are trying to do and run the program. The changes should be reflected in both the program when calling the getAllStudents() function and in the pgAdmin4 table.

Share link to the video demoing the program: https://drive.google.com/file/d/1psiD31LumXl2WSciIpaEsj2I_4ZXk5fH/view?usp=sharing
