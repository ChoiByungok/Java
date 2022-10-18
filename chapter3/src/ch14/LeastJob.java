package ch14;

public class LeastJob implements Scheduler {
    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담업무가 없거나 상담대기가 가장 적은 상담원에게 할당합니다.");
    }
}
