package me.day09.practice.practice01;

import java.util.Objects;

public class Member {

    private static int num;
    private int serialNo;
    private String memberID;
    private String password;
    private String memberPhoneNumber;
    private String memberEmail;
    private String memberBirthdate;

    public Member(String memberID ,String password, String memberPhoneNumber, String memberEmail, String memberBirthdate){

        this.memberID = memberID;
        this.password = password;
        this.memberPhoneNumber = memberPhoneNumber;
        this.memberEmail = memberEmail;
        this.memberBirthdate = memberBirthdate;
        num++;
        serialNo = num;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberBirthdate() {
        return memberBirthdate;
    }

    public void setMemberBirthdate(String memberBirthdate) {
        this.memberBirthdate = memberBirthdate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "serialNo=" + serialNo +
                ", memberID='" + memberID + '\'' +
                ", password='" + password + '\'' +
                ", memberPhoneNumber='" + memberPhoneNumber + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberBirthdate='" + memberBirthdate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return serialNo == member.serialNo && memberID.equals(member.memberID) && password.equals(member.password) && memberPhoneNumber.equals(member.memberPhoneNumber) && memberEmail.equals(member.memberEmail) && memberBirthdate.equals(member.memberBirthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNo, memberID, password, memberPhoneNumber, memberEmail, memberBirthdate);
    }

    public String  getNewPhoneNumber(String[] candidates){  //?????? 4???
        int count = 0;
        for(int i = 0 ;i<candidates.length; i++){
            count = 0;
            if(candidates[i].substring(4,11).equals(memberPhoneNumber.substring(4,11))){ //?????? 2?????? ????????? ??????
                this.memberPhoneNumber = candidates[i];
                return candidates[i];
            } else if (candidates[i].substring(4,8).equals(memberPhoneNumber.substring(4,8))) { //????????? 4?????? ??????
                this.memberPhoneNumber = candidates[i];
                return candidates[i];
            } else if (candidates[i].substring(9,13).equals(memberPhoneNumber.substring(9,13))) { // ?????? 4?????? ??????
                this.memberPhoneNumber = candidates[i];
                return candidates[i];
            }else{
                for(int j = 0; j < memberPhoneNumber.length(); j++){  // ?????? 3?????? ????????? ????????? ????????? ???
                    if(candidates[i].charAt(j) == memberPhoneNumber.charAt(j)){
                        count++;
                    }
                }
                if(count == 8){
                    this.memberPhoneNumber = candidates[i];
                    return candidates[i];
                }
            }
        }

        return memberPhoneNumber;
    }

    public void showMemberInfo(){
        System.out.println("?????? ???????????? : " + serialNo);
        System.out.println("?????? ID : " + memberID);
        System.out.println("???????????? : " + password);
        System.out.println("?????? ???????????? : " + memberPhoneNumber);
        System.out.println("?????? ????????? : " + memberEmail);
        System.out.println("?????? ???????????? : " + memberBirthdate);
    }
}
