/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author okwua
 */
public class User {
    //data members
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNumber;
    private String email;
    private int age;
    private String hobby;
    private BufferedImage photo;
    
    //methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public BufferedImage getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        try {
               this.photo = ImageIO.read(photo);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
    

    @Override
    public String toString() {
        return "User Profile Information:\n" +  "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Gender: " + gender + "\n" +  "Age: " + age + "\n" + "Phone Number: " + phoneNumber + "\n" + "Email: " + email + "\n" + "Hobby: " + hobby;
    }
    
    
}
