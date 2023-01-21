public class Voldemort
{
    public static String replaceYouKnowWho(String text){
        while (findYouKNowWho(text) >= 0){
        int temp = findYouKNowWho(text);
        String firstPart = text.substring(0, temp);
        String lastPart = text.substring(temp+ 9);
        text = firstPart + "He-Who-Must-Not-Be-Named" + lastPart;
        
        }
    return text;
    }
    
    public static int findYouKNowWho(String text){
    text = text.toLowerCase();
    int found = text.indexOf("voldermot");
    
    return found;
    }
}
