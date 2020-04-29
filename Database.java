public class Database {

    String username;
    String password;
    String host;

    public Database() {
        try {
            String line = "";
            username = "root";
            password = "root";
            host = "jdbc:odbc:face";
        } catch (Exception e) {
        }
    }
}

class Test {
    public static void main(String args[]) {
        Database d1 = new Database();
        System.out.println(d1.host + " " + d1.password + " " + d1.username);
    }
}


Generate Table

create table face(cid int, fname varchar(255),
		lname varchar(255), aname varchar(255),
		dob date, age int,
		gender varchar(255), address varchar(255),
		city varchar(255), state varchar(255),
		arresteddate date, crimein varchar(255),
		photo varchar(255)
		);

create table face_height(	cid int,
			hair int,
			forehead int,
			eyes int,
			nose int,
			lips int,
			chin int
			);

create table face_suspectphoto(crimeid int, suspectphoto varchar(255), photo_height varchar(255));

create table criminal_suspect(cid  int, criminalId int);

create table face_suspects(crimeid int, cid int);


Database


FACE
------------
create table face(cid number(3),
	          fname varchar2(20),
	          lname varchar2(20),
                            aname varchar2(20),
                            dob date,
	          age number(2),
                            gender varchar2(10),
                            address varchar2(10),
                            city varchar2(10),
	         state varchar2(10),
                            arresteddate date,
	         crimein varchar2(10),
                            photo  varchar2(50)
                           );

