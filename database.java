package assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
/**
 * This class is used to handle database that stores the performance of all players.
 * @author jiaqi
 */
public class database {
//    /**
//     * This constructor will run the method named "createTable" once an object of class database is created.
//     * @throws Exception 
//     */
//    
//    public static void main(String[] args) throws Exception{
//        System.out.println("Misspelled Words of user named b1");
//        ArrayList<String> arr = getMisspelledWords("b1");
//        for(String a:arr){
//            System.out.println(a);
//        }    
//        System.out.println("\nMisspelled Words of user named b2");
//        arr = getMisspelledWords("b2");
//        for(String a:arr){
//            System.out.println(a);
//        }    
//    }
//        System.out.println("Result of sorting table \"leaderboard\"");
//        LinkedHashMap <String, String> result = sort("leaderboard",null);
//        for (Map.Entry results : result.entrySet()){
//            System.out.println(results.getKey()+ " " + results.getValue());
//        }
//        System.out.println("\nResult of sorting table \"suddenDeath\"");
//        result = sort("suddenDeath","b1");
//        for (Map.Entry results : result.entrySet()){
//            System.out.println(results.getKey()+ " " + results.getValue());
//        }
//        System.out.println("\nResult of sorting table \"misspelled\"");
//        result = sort("misspelled","b1");
//        for (Map.Entry results : result.entrySet()){
//            System.out.println(results.getKey()+ " " + results.getValue());
//        }
//        System.out.println(calculateAverage("last10","WPM","a1"));
//        System.out.println(calculateAverage("last10","WPM","a2"));
//        System.out.println(calculateAverage("last10","WPM","a3"));
//        System.out.println(calculateAverage("last10","WPM","a4"));
//        System.out.println(calculateAverage("last10","WPM","a5"));
//        System.out.println(calculateAverage("last10","WPM","a6"));
//        System.out.println(calculateAverage("last10","WPM","a7"));
//        System.out.println(calculateAverage("last10","WPM","a8"));
//        System.out.println(calculateAverage("last10","WPM","a9"));
//        System.out.println(calculateAverage("last10","WPM","b1"));
//        System.out.println(calculateAverage("last10","WPM","b2"));
//        System.out.println(calculateAverage("allTime","WPM","a1"));
//        System.out.println(calculateAverage("allTime","WPM","a2"));
//        System.out.println(calculateAverage("allTime","Accuracy","b1"));
//        System.out.println(calculateAverage("allTime","Accuracy","b2"));
//        System.out.println(calculateAverage("allTime","Accuracy","a1"));
//        System.out.println(calculateAverage("allTime","Accuracy","a2"));
//        System.out.println(calculateAverage("last10","Accuracy","a1"));
//        System.out.println(calculateAverage("last10","Accuracy","b2"));
//        System.out.println(readDatabase("b1","8888"));
//        System.out.println(readDatabase("B1","8888"));
//        System.out.println(readDatabase("b2",null));
//        System.out.println(readDatabase("B2",null));
//        System.out.println(readDatabase(null,"1234"));
//        System.out.println(readDatabase(null,"8857"));
//        insertData("userlist", "a1", "1234", null);
//        insertData("userlist", "a2", "2345", null);
//        insertData("userlist", "a3", "3456", null);
//        insertData("userlist", "a4", "4567", null);
//        insertData("userlist", "a5", "5678", null);
//        insertData("userlist", "a6", "6789", null);
//        insertData("userlist", "a7", "7890", null);
//        insertData("userlist", "a8", "1314", null);
//        insertData("userlist", "a9", "1420", null);
//        insertData("userlist", "b1", "8888", null);
//        insertData("userlist", "b2", "3489", null);
//        insertData("suddenDeath","b1","79",null);
//        insertData("suddenDeath","b1","55",null);
//        insertData("suddenDeath","b1","56",null);
//        insertData("suddenDeath","b1","57",null);
//        insertData("suddenDeath","b1","58",null);
//        insertData("suddenDeath","b1","59",null);
//        insertData("suddenDeath","b1","60",null);
//        insertData("suddenDeath","b2","71",null);
//        insertData("suddenDeath","b2","72",null);
//        insertData("suddenDeath","b2","73",null);
//        insertData("misspelled","b2","want",null);
//        insertData("misspelled","b2","want",null);
//        insertData("misspelled","b2","want",null);
//        insertData("misspelled","b2","want",null);
//        insertData("misspelled","b1","want",null);
//        insertData("misspelled","b1","want",null);
//        insertData("misspelled","b1","want",null);  
//        insertData("misspelled","b1","where",null); 
//        insertData("misspelled","b1","where",null); 
//        insertData("misspelled","b1","takes",null); 
//        insertData("misspelled","b1","goes",null); 
//        insertData("misspelled","b2","where",null); 
//        insertData("misspelled","b2","when",null); 
//        insertData("misspelled","b2","when",null); 
//        insertData("misspelled","b2","when",null); 
//        insertData("result","b2",Double.toString(75),Double.toString(80));
//        insertData("result","b1",Double.toString(73),Double.toString(81));
//        insertData("result","b2",Double.toString(75),Double.toString(90));
//        insertData("result","b1",Double.toString(75),Double.toString(96));
//        insertData("result","b2",Double.toString(75),Double.toString(97));
//        insertData("result","b2",Double.toString(75),Double.toString(99));
//        insertData("result","b1",Double.toString(75),Double.toString(98));
//        insertData("result","b2",Double.toString(75),Double.toString(75));
//        insertData("result","b1",Double.toString(75),Double.toString(88));
//        insertData("result","b1",Double.toString(75),Double.toString(86));
//        insertData("result","b1",Double.toString(75),Double.toString(87));
//        insertData("result","b1",Double.toString(75),Double.toString(87));
//        insertData("result","b2",Double.toString(75),Double.toString(86));
//        insertData("result","b2",Double.toString(75),Double.toString(70));
//        insertData("result","b2",Double.toString(75),Double.toString(70));
//        insertData("result","b1",Double.toString(75),Double.toString(80));
//        insertData("result","b2",Double.toString(75),Double.toString(80));
//        insertData("result","b1",Double.toString(75),Double.toString(80));
//        insertData("result","b2",Double.toString(75),Double.toString(78));
//        insertData("result","b1",Double.toString(75),Double.toString(78));
//        insertData("result","b1",Double.toString(75),Double.toString(97));
//        insertData("result","b2",Double.toString(75),Double.toString(95));
//        insertData("result", "a1", "50", "100");
//        insertData("result", "a2", "65", "100");
//        insertData("result", "a3", "70", "100");
//        insertData("result", "a4", "80", "100");
//        insertData("result", "a5", "90", "100");
//        insertData("result", "a6", "100", "100");
//        insertData("result", "a7", "23", "100");
//        insertData("result", "a8", "65", "100");
//        insertData("result", "a9", "55", "100");     
//        
//        LinkedHashMap <String, String> result = sort("leaderboard","b1");
//        for (Map.Entry results : result.entrySet()){
//            System.out.println(results.getKey()+ " " + results.getValue());
//        }
//        System.out.println();
//        ArrayList<String> arr = getMisspelledWords("b1");
//        for(String a:arr){
//            System.out.println(a);
//        }        
//    }
//        insertData("misspelled", "nobody", "when", null);
//        createTable(); 
//        deleteResult("hahaha");
//        deleteResult("nobody");
//        resetIndex();
//        resetIndex();
//        System.out.println(readDatabase( "hahaha", "1234"));
//        System.out.println(calculateAverage("last10", "WPM", "hahaha"));
//        deleteUser("hahaha");
//        deleteResult("hahaha");
//        deleteTable();
//                
//      try {
//            // Establish a JDBC connection
//            Connection connection = getConnection();
//
//            // Get the current transaction isolation level
//            int isolationLevel = connection.getTransactionIsolation();
//
//            // Print the current transaction isolation level
//            System.out.println("Current Transaction Isolation Level: " + getIsolationLevelName(isolationLevel));
//
//            // Close the connection
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }    
    
    
    /**The method enables connection to MySQL database using JDBC(Java Database Connectivity).
     *@return a Connection object, which represents a connection with MySQL database
     *@throws Exception
     */
    public static Connection getConnection() throws Exception{
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/user";
            String username = "root";
            String password = "urownpassword";
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    
    /**
     * This method is used to create tables for storing user's records.
     * <pre>
     * "userlist"           - Username, user's password
     * "result"             - Username, WPM, accuracy score for each game played 
     * "leaderboard"    - Username, average WPM for each player for the last 10 games played
     * "misspelled"      - Username, words misspelled, frequency of each misspelled word 
     * "suddenDeath"  - Username, sudden death score 
     * </pre>
     *@throws Exception
     */
    public static void createTable() throws Exception{
        try{
            Connection connection = getConnection();
            String statement = "CREATE TABLE IF NOT EXISTS userlist"
                    + "(id INT PRIMARY KEY AUTO_INCREMENT, Username VARCHAR(255) COLLATE utf8_bin, Password VARCHAR(255) COLLATE utf8_bin)";
            PreparedStatement create = connection.prepareStatement(statement);
            statement = "CREATE TABLE IF NOT EXISTS result"
                    + "(id INT PRIMARY KEY AUTO_INCREMENT, Username VARCHAR(255) COLLATE utf8_bin,WPM FLOAT, Accuracy FLOAT)";
            PreparedStatement create1 = connection.prepareStatement(statement);
            statement = "CREATE TABLE IF NOT EXISTS leaderboard"
                    + "(id INT PRIMARY KEY AUTO_INCREMENT,Username VARCHAR(255) COLLATE utf8_bin,AvWpmLast10 FLOAT)";
            PreparedStatement create2 = connection.prepareStatement(statement);
            statement = "CREATE TABLE IF NOT EXISTS misspelled"
                    + "(id INT PRIMARY KEY AUTO_INCREMENT,Username VARCHAR(255) COLLATE utf8_bin,"
                    + "Word VARCHAR(255) COLLATE utf8_bin, Frequency INT)";
            PreparedStatement create3 = connection.prepareStatement(statement);
            statement = "CREATE TABLE IF NOT EXISTS suddenDeath"
                    + "(id INT PRIMARY KEY AUTO_INCREMENT,Username VARCHAR(255) COLLATE utf8_bin,Score FLOAT)";
            PreparedStatement create4 = connection.prepareStatement(statement);
            create.executeUpdate();
            create1.executeUpdate();
            create2.executeUpdate();
            create3.executeUpdate();
            create4.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    /**
     * This method is used to read from table in database named "userlist" to verify EITHER
     * the existence of user OR
     * the existence of password entered OR
     * if the password entered by user is correct corresponding to the username.
     * @param user 
     * <pre>
     * Username entered - verifying existence of user AND verifying if the password entered by user is correct
     * null -  verifying existence of password
     * </pre>
     * @param password 
     * <pre>
     * Password entered - verifying existence of password AND verifying if the password entered by user is correct
     * null - verifying existence of user
     * </pre>
     * @return A Boolean output, 
     * <pre>
     * for verifying existence of user, return true if user already exists, otherwise false;
     * for verifying existence of password, return true if password already exists, otherwise false;
     * for verifying if the password entered by user is correct, return true if the password entered by user is correct corresponding to the username, otherwise false
     * </pre>
     * @throws Exception 
     */
    public static boolean readDatabase(String user, String password) throws Exception{
        try {
            Connection connection = getConnection();
            String statement;
            //readDatabase(username, password)
            if (user!=null && password!=null)
                statement = "SELECT * FROM userlist WHERE Username = '"+user+"' AND Password = '"+password+"'";
            //readDatabase(username, null)
            else if(password==null)
                statement = "SELECT * FROM userList WHERE Username = '"+user+"'";
            //readDatabase(null, password)
            else 
                statement = "SELECT * FROM userList WHERE Password = '"+password+"'";
            PreparedStatement search = connection.prepareStatement(statement);
            ResultSet result = search.executeQuery();
            return result.next();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
     
    /**
     * This method is used to insert data into 4 tables namely "userlist", "result", "misspelled" and "suddenDeath", specified by taking in parameter from the caller.
     * @param a Table chosen to insert data into, either "userlist", "result", "misspelled" or "suddenDeath"
     * @param b Username 
     * @param c
     * <pre>
     * for table "userlist"           - User's password 
     * for table "result"             - User's WPM score for current game
     * for table "misspelled"      - User's misspelled word 
     * for table "suddenDeath"  - User's sudden death score
     * </pre>
     * @param d 
     * <pre>
     * for table "result" - User's accuracy score 
     * for tables "userlist", "misspelled", "suddenDeath" - null
     * </pre>
     * @throws Exception 
     */
    public static void insertData(String a, String b, String c, String d) throws Exception{
        try{
            Connection connection = getConnection();
            String statement ="";
            int frequency=1;
            switch(a){
                //insertData("userlist", username, password, null)
                case "userlist":
                    statement = "SELECT * FROM userlist WHERE Username ='"+b+"'";
                    PreparedStatement check = connection.prepareStatement(statement);
                    ResultSet result = check.executeQuery();
                    if (result.next())
                        return;
                    else 
                        statement = "INSERT INTO userlist (Username, Password) VALUES ('"+b+"','"+c+"')";
                    break;
                
                //insertData("result", username, Double.toString(wpm), Double.toString(accuracy))
                case "result":
                    statement="INSERT INTO result (Username,Wpm, Accuracy) VALUES ('"+b+"',?,?)";
                    break;
                    
                //insertData("misspelled", username, word, null)
                case "misspelled":
                    statement = "SELECT * FROM misspelled WHERE Username ='"+b+"' AND Word ='"+c+"'";
                    PreparedStatement check1 = connection.prepareStatement(statement);
                    ResultSet result1 = check1.executeQuery();
                    if (result1.next()){
                        frequency = result1.getInt("Frequency") +1;
                        statement = "UPDATE misspelled SET Frequency= ? WHERE Username ='"+b+"' AND Word ='"+c+"'";
                    }
                    else
                        statement="INSERT INTO misspelled (Username,Word, Frequency) VALUES ('"+b+"','"+c+"', ?)";
                    break;
                
                //insertData("suddenDeath", username, Double.toString(suddenDeathScore), null)
                case "suddenDeath":
                    statement = "INSERT INTO suddenDeath (Username,Score) VALUES (?,?)";
                    break;
            }            
            PreparedStatement insert = connection.prepareStatement(statement);
            if (a.equals("result")){
                insert.setFloat(1,Float.parseFloat(c));
                insert.setFloat(2,Float.parseFloat(d));
            }
            else if (a.equals("suddenDeath")){
                insert.setString(1,b);
                insert.setFloat(2,Float.parseFloat(c));
            }
            else if(a.equals("misspelled"))
                insert.setInt(1,frequency);
            insert.executeUpdate();
        }      
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    /**
     * This method is used to calculate 
     * EITHER the average WPM of the player 
     * OR the average accuracy score of the player
     * AND insert the average WPM for last 10 games played by the player into table "leaderboard".
     * @param mode EITHER "allTime" OR "last10", specifying the number of records selected
     * <pre>
     * allTime - include all the records of the player
     * last10   - include only the last 10 records of the player
     * </pre>
     * @param choice EITHER "WPM" OR "Accuracy", specifying which columns in table "result" will be chosen, 
     * in which the data will be used in calculation of average score  
     * @param user Username
     * @return A String representation of average score which is originally in float data type
     * @throws Exception 
     */
    public static String calculateAverage(String mode, String choice, String user) throws Exception{
        try{
            float average;
            String statement;
            Connection connection = getConnection();
            statement = "SELECT * FROM userlist WHERE Username = '"+user+"'";
            PreparedStatement userExist1 = connection.prepareStatement(statement);
            ResultSet userExist = userExist1.executeQuery();
            if (userExist.next()){
                //calculateAverage("allTime","WPM"/"Accuracy",username)
                if (mode.equals("allTime"))
                    statement = "SELECT AVG("+choice+")AS AVG FROM result WHERE Username = '"+user+"'";
                //calculateAverage("last10","WPM"/"Accuracy",username)
                else
                    statement = "SELECT AVG("+choice+") as AVG "
                            + "FROM(SELECT "+choice+" FROM result WHERE Username='"+user+"' ORDER BY id DESC LIMIT 10) AS subquery";
                PreparedStatement calculate = connection.prepareStatement(statement);
                ResultSet result = calculate.executeQuery();
                if (!result.next())
                    average = 0;
                else
                   average = result.getFloat("AVG");
                if (mode.equals("last10")&&choice.equals("WPM")){
                    statement = "SELECT * FROM leaderboard WHERE Username = '"+user+"'";
                    PreparedStatement check = connection.prepareStatement(statement);
                    ResultSet result1 = check.executeQuery();
                    if (result1.next()){
                        statement = "UPDATE leaderboard SET AvWpmLast10=? WHERE Username = ?";
                        PreparedStatement update = connection.prepareStatement(statement);
                        update.setFloat(1, average);
                        update.setString(2, user);
                        update.executeUpdate();
                    }
                    else{
                        statement="INSERT INTO leaderboard (Username, AvWpmLast10) VALUES (?,?)";
                        PreparedStatement insert = connection.prepareStatement(statement);
                        insert.setString(1, user);
                        insert.setFloat(2, average);
                        insert.executeUpdate();
                    }
                }
                return Float.toString(average);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**
     * This method is used to 
     * EITHER sort the user's ranking 
     * OR the misspelled words by players based on the frequency 
     * OR return a collection of sudden death scores by the user.
     * @param mode Table chosen to be used, EITHER "leaderboard","misspelled" OR "suddenDeath"
     * @param username 
     * <pre>
     * for tables "misspelled", "suddenDeath" - Username 
     * for table "leaderboard" - null
     * </pre>
     * @return A LinkedHashMap object mapping a String object to another String object that stores 
     * <pre>
     * for table "leaderboard",
     * Key   - Username of top 10 players 
     * Value - average WPM for the last 10 games played by the top 10 players
     * 
     * for table "misspelled",
     * Key   - 10 most misspelled words by the user
     * Value - frequency of each misspelled word from the 10 most misspelled words 
     * 
     * for table "suddenDeath",
     * Key   - ordinal number of times of sudden death mode played by a specific player
     * Value - sudden death scores by the user 
     * </pre>
     * @throws Exception 
     */
    public static LinkedHashMap<String,String> sort(String mode, String username) throws Exception{
        LinkedHashMap <String, String> selected = new LinkedHashMap();
        String key="", value="", statement="";
        try{
            Connection connection = getConnection();
            switch(mode) {
                //sort("leaderboard", null)
                case "leaderboard":
                    statement = "SELECT * FROM leaderboard ORDER BY AvWpmLast10 DESC LIMIT 10";
                    key = "Username";
                    value = "AvWpmLast10";
                    break;
                
                //sort("misspelled", username)
                case "misspelled":
                    statement = "SELECT * FROM misspelled WHERE Username = '"+username+"' ORDER BY Frequency DESC LIMIT 10";
                    key = "Word";
                    value = "Frequency";
                    break;
                
                //sort("suddenDeath", username)
                case "suddenDeath":
                    statement = "CREATE TEMPORARY TABLE temp AS SELECT Username, Score FROM suddenDeath WHERE Username = '"+username+"'";
                    PreparedStatement select = connection.prepareStatement(statement);
                    select.executeUpdate();
                    statement = "ALTER TABLE temp ADD id INT PRIMARY KEY AUTO_INCREMENT";
                    PreparedStatement add = connection.prepareStatement(statement);
                    add.executeUpdate();
                    key = "id";
                    value = "Score";
                    statement = "SELECT * FROM temp ORDER BY id DESC";
                    break;                
            }
            PreparedStatement sort = connection.prepareStatement(statement);
            ResultSet result = sort.executeQuery();
            while (result.next()){
                selected.put(result.getString(key),
                        String.valueOf(mode.equals("misspelled")?result.getInt(value):result.getFloat(value)));
            }                            
        }
        catch(Exception e){
            System.out.println(e);
        }
        return selected;
    }
    
    /**
     * This method is used to return a collection of misspelled words of specific user when called.
     * @param user Username
     * @return An ArrayList consists of the misspelled words by a specific user
     * @throws Exception 
     */
    public static ArrayList<String> getMisspelledWords(String user) throws Exception{
        ArrayList<String> misspelledWords = new ArrayList();
        try{
            Connection connection = getConnection();
            String statement = "Select * FROM misspelled WHERE Username = '"+user+"'";
            PreparedStatement get = connection.prepareStatement(statement);
            ResultSet result = get.executeQuery();
            while(result.next())
                misspelledWords.add(result.getString("Word"));
        }
        catch(Exception e){
            System.out.println(e);
        }
        return misspelledWords;
    }
    
//    public static void resetIndex() throws Exception{
//        try{
//            Connection connection = getConnection();
//            String statement ="ALTER TABLE result AUTO_INCREMENT =1";
////            ALTER TABLE `table` AUTO_INCREMENT = number
//            PreparedStatement change = connection.prepareStatement(statement);
//            change.executeUpdate();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//    
//    public static void deleteUser(String username) throws Exception{
//        try{
//            Connection connection = getConnection();
//            String statement ="DELETE FROM userlist WHERE Username =?";
//            PreparedStatement delete = connection.prepareStatement(statement);
//            delete.setString(1,username);
//            delete.executeUpdate();
////            String statement ="SELECT username, password FROM userlist AS a,b";
////            PreparedStatement delete = connection.prepareStatement(statement);
////            delete.setString(1,username);
////            delete.executeUpdate();
////            if (row>0){
////                System.out.println("Deleted");
////            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//    
//    public static void deleteResult(String username) throws Exception{
//        try{
//            Connection connection = getConnection();
//            String statement ="DELETE FROM result WHERE Username =?";
//            PreparedStatement delete = connection.prepareStatement(statement);
//            delete.setString(1,username);
//            delete.executeUpdate();
////            String statement ="SELECT username, password FROM userlist AS a,b";
////            PreparedStatement delete = connection.prepareStatement(statement);
////            delete.setString(1,username);
////            delete.executeUpdate();
////            if (row>0){
////                System.out.println("Deleted");
////            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//     public static void deleteTable() throws Exception{
//        try{
//            Connection connection = getConnection();
//            String statement ="DROP TABLE misspelled";
//            PreparedStatement drop = connection.prepareStatement(statement);
//            statement ="DROP TABLE leaderboard";
//            PreparedStatement drop1 = connection.prepareStatement(statement);
//            statement ="DROP TABLE result";
//            PreparedStatement drop2 = connection.prepareStatement(statement);
//            statement ="DROP TABLE userlist";
//            PreparedStatement drop3 = connection.prepareStatement(statement);
//            statement ="DROP TABLE suddenDeath";
//            PreparedStatement drop4 = connection.prepareStatement(statement);
////            drop.executeUpdate();
//            drop1.executeUpdate();
////            drop2.executeUpdate();
////            drop3.executeUpdate();
////            drop4.executeUpdate();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//     private static String getIsolationLevelName(int isolationLevel) {
//        switch (isolationLevel) {
//            case Connection.TRANSACTION_NONE:
//                return "TRANSACTION_NONE";
//            case Connection.TRANSACTION_READ_UNCOMMITTED:
//                return "TRANSACTION_READ_UNCOMMITTED";
//            case Connection.TRANSACTION_READ_COMMITTED:
//                return "TRANSACTION_READ_COMMITTED";
//            case Connection.TRANSACTION_REPEATABLE_READ:
//                return "TRANSACTION_REPEATABLE_READ";
//            case Connection.TRANSACTION_SERIALIZABLE:
//                return "TRANSACTION_SERIALIZABLE";
//            default:
//                return "Unknown Isolation Level";
//        }
//    }
}