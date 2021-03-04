package org.comstudy21.webapp.dto;

public class MemberDTO {
   String userid;
   String username;
   String password;
   String email;
   String zipcode;
   String address1;
   String address2;
   String phone;
   String regedit;
   
   public MemberDTO() { this("","","","","","","","",""); }

   public MemberDTO(String userid, String username, String password, String email, String zipcode, String address1,
         String address2, String phone, String regedit) {
      this.userid = userid;
      this.username = username;
      this.password = password;
      this.email = email;
      this.zipcode = zipcode;
      this.address1 = address1;
      this.address2 = address2;
      this.phone = phone;
      this.regedit = regedit;
   }

   public String getUserid() {
      return userid;
   }

   public void setUserid(String userid) {
      this.userid = userid;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getZipcode() {
      return zipcode;
   }

   public void setZipcode(String zipcode) {
      this.zipcode = zipcode;
   }

   public String getAddress1() {
      return address1;
   }

   public void setAddress1(String address1) {
      this.address1 = address1;
   }

   public String getAddress2() {
      return address2;
   }

   public void setAddress2(String address2) {
      this.address2 = address2;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getRegedit() {
      return regedit;
   }

   public void setRegedit(String regedit) {
      this.regedit = regedit;
   }

   @Override
   public String toString() {
      return "MemberDTO [userid=" + userid + ", username=" + username + ", password=" + password + ", email=" + email
            + ", zipcode=" + zipcode + ", address1=" + address1 + ", address2=" + address2 + ", phone=" + phone
            + ", regedit=" + regedit + "]";
   }
}