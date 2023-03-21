class Solution {
    public String solution(String new_id) {
        String s = new KAKAOID(new_id)
            .step1()
            .step2()
            .step3()
            .step4()
            .step5()
            .step6()
            .step7()
            .getResult();
            
        return s;
    }
    
    private static class KAKAOID{
    private String s;
    
    KAKAOID(String s){
        this.s = s;
    }
    
    private KAKAOID step1(){
        s = s.toLowerCase();
        return this;
    }
    
    private KAKAOID step2(){
        s = s.replaceAll("[^a-z0-9._-]", "");
        return this;
    }
    
    private KAKAOID step3(){
        s = s.replaceAll("[.]{2,}", ".");
        return this;
    }
    
    private KAKAOID step4() {
        s = s.replaceAll("^[.]|[.]$", "");
        return this;
    }
    
    private KAKAOID step5(){
        s = s.isEmpty() ? "a" : s;
        return this;
    }
    
    private KAKAOID step6(){
        if(s.length() >= 16){
            s = s.substring(0, 15);
        }
        s = s.replaceAll("[.]$", "");
        return this;
        }
    
    private KAKAOID step7(){
        StringBuilder sBuilder = new StringBuilder(s);
        while (sBuilder.length() <= 2){
            sBuilder.append(sBuilder.charAt(sBuilder.length()-1));
        }
        s = sBuilder.toString();
        return this;
        }
    
    private String getResult(){
        return s;
    }
    }
}