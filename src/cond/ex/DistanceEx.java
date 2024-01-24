package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {

        int distance = 8;

        String result;

        if (distance <= 1){
            result = "도보";
        }else if(distance <= 10){
            result = "자전거";
        }else if(distance <= 100){
            result = "자동차";
        }else{
            result = "비행기";
        }
        System.out.println(result + "를 이용하세요.");



    }
}
