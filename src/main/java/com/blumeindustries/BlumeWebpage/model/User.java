package com.blumeindustries.BlumeWebpage.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")

public class User
{


    @Id
//    private File image;
//    private String filename; // image file name
//    private LocalDate createdtime; // upload time
//    private Binary content; // file content
//    private String contenttype; // file type
//    private long size; // file size



    private String id;
    private String mobileNo;



    private String firstname;
    private String lastname;

    private String dob;
    private String age;



    private String email;
    private String gender;
    private String address;
    private String city;
    private String pincode;
    private String state;
    private String country;

    private String hobbies;
    private String courseapplied;

    User(){}

    //profile Image
//    public File getImage() {
//        return image;
//    }
//
//    public void setImage(File image) {
//        this.image = image;
//    }
//
//    public String getFilename() {
//        return filename;
//    }
//
//    public void setFilename(String filename) {
//        this.filename = filename;
//    }
//
//    public LocalDate getCreatedtime() {
//        return createdtime;
//    }
//
//    public void setCreatedtime(LocalDate createdtime) {
//        this.createdtime = createdtime;
//    }
//
//    public Binary getContent() {
//        return content;
//    }
//
//    public void setContent(Binary content) {
//        this.content = content;
//    }
//
//    public String getContenttype() {
//        return contenttype;
//    }
//
//    public void setContenttype(String contenttype) {
//        this.contenttype = contenttype;
//    }
//
//    public long getSize() {
//        return size;
//    }
//
//    public void setSize(long size) {
//        this.size = size;
//    }



    //Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }






    //Name
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }




    //dob and age
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }





    //email,gender and address
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    //hobbies and educational information

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getCourseapplied() {
        return courseapplied;
    }

    public void setCourseapplied(String courseapplied) {
        this.courseapplied = courseapplied;
    }



}
