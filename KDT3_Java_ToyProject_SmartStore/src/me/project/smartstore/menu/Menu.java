package me.project.smartstore.menu;

import me.project.smartstore.customer.ClassifiedCustomers;
import me.project.smartstore.customer.Customer;
import me.project.smartstore.customer.Customers;
import me.project.smartstore.group.Group;
import me.project.smartstore.group.Parameter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Group g;
    Group v;
    Group vv;
   // ArrayList<Customer> customers = new ArrayList<>();
    ClassifiedCustomers classifiedCustomers = new ClassifiedCustomers();

    Customers customers = new Customers();

    Customer customer = new Customer();

    Scanner sc = new Scanner(System.in);



    public void mainMenu(){
        System.out.println("==============================\n" +
                " 1. 파라미터 설정\n" +
                " 2. 고객 데이터 입력\n" +
                " 3. 요약\n" +
                " 4. 종료\n" +
                "==============================");
        CommonMessage.selectNumber();
        String input;
        input = sc.next();
        switch (input){

            case "1" :
                parameterControlMenu();
                break;
            case "2" :
                customerControlMenu();
                break;
            case "3":
                summaryMenu();
                break;
            case "4":
                System.out.println("프로그램이 종료 되었습니다.");
                return;
            default:
                CommonMessage.invalidType();
                mainMenu();
        }
    }
    public void parameterControlMenu(){
        System.out.println("==============================\n" +
                " 1. 파라미터 설정\n" +
                " 2. 파라미터 보기\n" +
                " 3. 파라미터 수정\n" +
                " 4. 뒤로가기\n" +
                "==============================");
        CommonMessage.selectNumber();
        String input;
        input = sc.next();
        switch (input){
            case "1" :
                setParameter();
                break;
            case "2":
                viewParameter();
                break;
            case "3":
                updateParameter();
                break;
            case "4" :
                mainMenu();
                break;
            default:
                CommonMessage.invalidType();
                parameterControlMenu();
        }
    }
    public void setParameter(){
        CommonMessage.selectGroupPrint();
        String input = sc.next();
        input = input.toUpperCase();
        switch (input){
            case "GENERAL" :
                if(g == null){
                    g = new Group("GENERAL",new Parameter());
                    managementParameter(g);
                }else {
                    System.out.println("\nGENERAL 그룹은 이미 설정되었습니다.\n");
                    System.out.println(g);
                    setParameter();
                }
                break;
            case "VIP" :
                if(v == null){
                    v = new Group("VIP",new Parameter());
                    managementParameter(v);
                }else {
                    System.out.println("\nVIP 그룹은 이미 설정되었습니다.\n");
                    System.out.println(v);
                    setParameter();
                }
                break;
            case "VVIP" :
                if(vv == null){
                    vv = new Group("VVIP",new Parameter());
                    managementParameter(vv);
                }else {
                    System.out.println("\nVIP 그룹은 이미 설정되었습니다.\n");
                    System.out.println(vv);
                    setParameter();
                }
                break;
            case "END" :
                parameterControlMenu();
                break;
            default:
                CommonMessage.invalidInput();
                setParameter();
        }
    }
    public void managementParameter(Group group){
        CommonMessage.inputParameterPrint();
        CommonMessage.selectNumber();
        String input = sc.next();
        switch (input){
            case "1" :
                int spentTime = inputSpentTime();
                group.getParameter().setMinimumSpentTime(spentTime);
                managementParameter(group);
                break;
            case "2" :
                int totalPay = inputTotalPay();
                group.getParameter().setMinimumTotalPay(totalPay);
                managementParameter(group);
                break;
            case "3" :
                setParameter();
                break;
            default:
                CommonMessage.invalidType();
                managementParameter(group);
        }
    }
    public int inputSpentTime(){
        CommonMessage.inputMinimumSpentPrint();
        int input = 0;
        if(sc.hasNextInt()){  //정수값만 입력 받도록 설정
            input = sc.nextInt();
        }
        else {
            CommonMessage.invalidType();
            inputSpentTime(); //정수 외 값이 들어오면 재귀호출
        }
        return input;
    }
    public int inputTotalPay(){
        CommonMessage.inputMinimumPayPrint();
        int input = 0;
        if(sc.hasNextInt()){  //정수값만 입력 받도록 설정
            input = sc.nextInt();
        }
        else {
            CommonMessage.invalidType();
            inputSpentTime(); //정수 외 값이 들어오면 재귀호출
        }
        return input;
    }
    public void viewParameter(){
        CommonMessage.selectGroupPrint();
        String input = sc.next();
        input = input.toUpperCase();
        switch (input){
            case "GENERAL" :
                if(g == null){
                    System.out.println("\n그룹: GENERAL\n" +
                            "파라미터: null\n");
                    viewParameter();
                }else {
                    System.out.println(g);
                    viewParameter();
                }
                break;
            case "VIP" :
                if(v == null){
                    System.out.println("\n그룹: VIP\n" +
                            "파라미터: null\n");
                    viewParameter();
                }else {
                    System.out.println(v);
                    viewParameter();
                }
                break;
            case "VVIP" :
                if(vv == null){
                    System.out.println("\n그룹: VVIP\n" +
                            "파라미터: null\n");
                    viewParameter();
                }else {
                    System.out.println(vv);
                    viewParameter();
                }
                break;
            case "END" :
                parameterControlMenu();
                break;
            default:
                CommonMessage.invalidInput();
                viewParameter();
        }
    }
    public void updateParameter(){
        CommonMessage.selectGroupPrint();
        String input = sc.next();
        input = input.toUpperCase();
        switch (input){
            case "GENERAL" :
                if(g == null){
                    CommonMessage.nonExistMessage();
                    updateParameter();
                }else {
                    System.out.println(g);
                    updateSetParameterData(g);
                }
                break;
            case "VIP" :
                if(v == null){
                    CommonMessage.nonExistMessage();
                    updateParameter();
                }else {
                    System.out.println(v);
                    updateSetParameterData(v);
                }
                break;
            case "VVIP" :
                if(vv == null){
                    CommonMessage.nonExistMessage();
                    updateParameter();
                }else {
                    System.out.println(vv);
                    updateSetParameterData(vv);
                }
                break;
            case "END" :
                parameterControlMenu();
                break;
            default:
                CommonMessage.invalidInput();
                updateParameter();
        }
    }
    public void updateSetParameterData(Group group){
        CommonMessage.inputParameterPrint();
        CommonMessage.selectNumber();
        String input = sc.next();
        switch (input){
            case "1" :
                int spentTime = inputSpentTime();
                group.getParameter().setMinimumSpentTime(spentTime);
                updateSetParameterData(group);
                break;
            case "2" :
                int totalPay = inputTotalPay();
                group.getParameter().setMinimumTotalPay(totalPay);
                updateSetParameterData(group);
                break;
            case "3" :
                System.out.println(group);
                updateParameter();
                break;
            default:
                CommonMessage.invalidType();
                updateSetParameterData(group);
        }
    }
    public void customerControlMenu(){
        System.out.println("==============================\n" +
                " 1. 고객 데이터 추가\n" +
                " 2. 고객 데이터 보기\n" +
                " 3. 고객 데이터 수정\n" +
                " 4. 고객 데이터 삭제\n" +
                " 5. 뒤로가기\n" +
                "==============================");
        CommonMessage.selectNumber();
        String input;
        input = sc.next();
        switch (input){
            case "1":
                addCustomerData();
                break;
            case "2" :
                viewCustomerData();
                break;
            case "3" :
                updateCustomerData();
                break;
            case "4" :
                deleteCustomerData();
                break;
            case "5":
                mainMenu();
                break;
            default:
                CommonMessage.invalidType();
                customerControlMenu();
        }
    }
    public void addCustomerData(){
        System.out.println("** 0을 누르면 취소 할 수 있습니다. **");
        System.out.print("몇명의 고객을 설정 하시겠습니까? ");
        int input = 0;
        if(sc.hasNextInt()){
            input = sc.nextInt();
            if(input > 0){
                setCustomerDataMenu(input);
            } else if (input == 0) {
                customerControlMenu();
            }else {
                CommonMessage.invalidType();
                addCustomerData();
            }
        }else{
            CommonMessage.invalidType();
            addCustomerData();
        }
    }
    public void setCustomerDataMenu(int size){
        int count = 0;
        while (count != size){
            System.out.println((count+1) + "번째 고객 설정");
            System.out.println("==============================\n" +
                    " 1. 고객 이름 설정\n" +
                    " 2. 고객 ID 설정\n" +
                    " 3. 고객 사용시간 설정\n" +
                    " 4. 고객 사용 금액 설정\n" +
                    " 5. 저장\n" +
                    "==============================");
            CommonMessage.selectNumber();
            String input = sc.next();
            switch (input) {
                case "1":
                    while (true) {
                        System.out.print("고객 이름을 입력해주세요: ");
                        String name = sc.next();
                        if (name.length() > 2) {
                            customer.setName(name);
                            break;
                        } else {
                            CommonMessage.invalidFormat();
                        }
                    }
                    break;
                case "2":
                    while (true) {
                        System.out.print("고객 ID를 입력해주세요: ");
                        String userID = sc.next();
                        if (userID.length() > 4) {
                            customer.setUserID(userID);
                            break;
                        } else {
                            CommonMessage.invalidFormat();
                        }
                    }
                    break;
                case "3":
                    System.out.print("고객의 이용시간을 입력해주세요: ");
                    while (!sc.hasNextInt()) {
                        CommonMessage.invalidType();
                        System.out.print("고객의 이용시간을 입력해주세요: ");
                        sc.next();
                    }
                    customer.setSpentTime(sc.nextInt());
                    break;
                case "4":
                    System.out.print("고객의 사용금액을 입력해주세요: ");
                    while (!sc.hasNextInt()){
                        CommonMessage.invalidType();
                        System.out.print("고객의 사용금액을 입력해주세요: ");
                        sc.next();
                    }
                    customer.setTotalPay(sc.nextInt());
                    break;
                case "5":
                    customers.add(customer);
                    customer = new Customer();
                    count++;
                    break;
                default:
                    CommonMessage.invalidType();
            }
        }
        customerControlMenu();
    }

    public void viewCustomerData(){
        System.out.println("======= 고객정보 =======");
        for(int i = 0 ; i < customers.size(); i++){
            System.out.println("No."+(i+1) + " =>" + customers.get(i));
        }
        customerControlMenu();
    }
    public void updateCustomerData(){
        if(customers.size() < 1){
            System.out.println("고객정보가 없어서 수정을 할 수 없습니다. ");
            customerControlMenu();
        }else{
            System.out.println("======= 고객정보 =======");
            for(int i = 0 ; i < customers.size(); i++){
                System.out.println("No."+(i+1) + " =>" + customers.get(i));
            }
        }
        int input = 0;
        System.out.print("\n몇번째 고객을 설정 하시겠습니까 ( 1 ~ " + customers.size() + " )?");
        if(!sc.hasNextInt()){
            CommonMessage.invalidType();
            sc.next();
            updateCustomerData();
        } else if (sc.hasNextInt()) {
            input = sc.nextInt();
            if(input > customers.size() || input == 0) {
                System.out.println("없는 고객입니다.");
                updateCustomerData();
            }else {
                updateCustomersData(customers, input);
            }
        }
    }
    public void updateCustomersData(Customers customers, int index){
        System.out.println("==============================\n" +
                " 1. 고객 이름 설정\n" +
                " 2. 고객 ID 설정\n" +
                " 3. 고객 사용시간 설정\n" +
                " 4. 고객 사용 금액 설정\n" +
                " 5. 뒤로가기\n" +
                "==============================");
        CommonMessage.selectNumber();
        String input = sc.next();
        switch (input){
            case "1" :
                while (true) {
                    System.out.print("고객 이름을 입력해주세요: ");
                    String name = sc.next();
                    if (name.length() > 2) {
                        customers.get(index-1).setName(name);
                        break;
                    } else {
                        CommonMessage.invalidFormat();
                    }
                }
                updateCustomersData(customers,index);
                break;
            case "2" :
                while (true) {
                    System.out.print("고객 ID를 입력해주세요: ");
                    String userID = sc.next();
                    if (userID.length() > 4) {
                        customers.get(index-1).setUserID(userID);
                        break;
                    } else {
                        CommonMessage.invalidFormat();
                    }
                }
                updateCustomersData(customers,index);
                break;
            case "3" :
                System.out.print("고객의 이용시간을 입력해주세요: ");
                while (!sc.hasNextInt()) {
                    CommonMessage.invalidType();
                    System.out.print("고객의 이용시간을 입력해주세요: ");
                    sc.next();
                }
                customers.get(index-1).setSpentTime(sc.nextInt());
                updateCustomersData(customers,index);
                break;
            case "4" :
                System.out.print("고객의 사용금액을 입력해주세요: ");
                while (!sc.hasNextInt()){
                    CommonMessage.invalidType();
                    System.out.print("고객의 사용금액을 입력해주세요: ");
                    sc.next();
                }
                customers.get(index-1).setTotalPay(sc.nextInt());
                updateCustomersData(customers,index);
                break;
            case "5" :
                customerControlMenu();
                break;
            default:
                CommonMessage.invalidType();
                updateCustomersData(customers,index);
        }

    }
    public void deleteCustomerData(){
        if(customers.size() < 1){
            System.out.println("고객 정보가 없습니다.");
            customerControlMenu();
        }else{
            System.out.println("======= 고객정보 =======");
            for(int i = 0 ; i < customers.size(); i++){
                System.out.println("No."+(i+1) + " =>" + customers.get(i));
            }
        }
        int input = 0;
        System.out.print("\n몇번째 고객을 삭제 하시겠습니까 ( 1 ~ " + customers.size() + " )?");
        if(!sc.hasNextInt()){
            CommonMessage.invalidType();
            sc.next();
            deleteCustomerData();
        } else if (sc.hasNextInt()) {
            input = sc.nextInt();
            if(input > customers.size() || input < 1) {
                System.out.println("번호를 잘못 선택했습니다. ( Range: 1 ~ " + customers.size() + " )");
                customerControlMenu();
            }else {
                customers.remove((input-1));
                System.out.println("성공적으로 삭제 되었습니다.!");
                System.out.println("======= 고객정보 =======");
                for(int i = 0 ; i < customers.size(); i++){
                    System.out.println("No. " + (i+1) + " =>" + customers.get(i));
                }
                customerControlMenu();
            }
        }
    }
    public void summaryMenu(){

        System.out.println("summary 구현 못했습니다.");
        mainMenu();
//        System.out.println("==============================\n" +
//                " 1. 파라미터별 고객 그룹\n" +
//                " 2. 파라미터별 고객 그룹 이름순으로 정렬\n" +
//                        " 3. 파라미터별 고객 그룹 소비시간으로 정렬\n" +
//                        " 4. 파라미터별 고객 그룹 소비금액으로 정렬\n" +
//                        " 5. 뒤로가기\n" +
//                        "==============================");
//                CommonMessage.selectNumber();
//                String input;
//                input = sc.next();
//                switch (input){
//                    case "1" :
//                        summary();
//                        break;
//                    case "2" :
//                        sortedByNameSummary();
//                        break;
//                    case "3" :
//                        sortedBySpentTimeSummary();
//                        break;
//                    case "4" :
//                        sortedByTotalPaySummary();
//                        break;
//                    case "5" :
//                        mainMenu();
//                        break;
//                    default:
//                CommonMessage.invalidType();
//                customerControlMenu();
//        }
    }
    public void summary(){

        classifiedCustomers.setClassifiedCustomers(customers.groupByCustomer(g,v,vv));
        System.out.println(classifiedCustomers);
    }
    public void sortedByNameSummary(){

    }
    public void sortedBySpentTimeSummary(){

    }
    public void sortedByTotalPaySummary(){

    }
}
