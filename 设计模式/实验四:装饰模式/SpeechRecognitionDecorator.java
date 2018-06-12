public class SpeechRecognitionDecorator extends Decorator {
    public SpeechRecognitionDecorator(){}

    public SpeechRecognitionDecorator(Car in){
        hmc = in;
    }

    public void dotheThing(){
        hmc.dotheThing();
        System.out.print("+语音识别");
    }
}
