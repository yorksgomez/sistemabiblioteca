package edu.eci.cvds.SistemaBiblioteca.model;


public class  User  {

    private String mail;
    private String name;
    private String password;


    public User() {

    }

    public User( String mail, String name, String password) {

        this.mail = mail;
        this.name = name;
        this.password = password;

    }


    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
