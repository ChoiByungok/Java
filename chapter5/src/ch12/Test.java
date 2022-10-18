package ch12;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();
        Member memberLee = new Member(1001,"이순신");
        Member memberKim = new Member(1002,"김유신");
        Member memberKang = new Member(1003,"강감찬");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);

        Member memberHong = new Member(1004,"홍길동");
        memberHashSet.addMember(memberHong);

        Member memberLee2 = new Member(1005,"이순신");
        memberHashSet.addMember(memberLee2);
        memberHashSet.showAllMember();

    }
}
