public class MyStringBuilder {

    char []result;


    MyStringBuilder append(char[] appendData){
        result = mergeData(result,appendData);
        return this;
    }

    String toString(char[] appendData){

        return result.toString();
    }

    char[] mergeData(char[] first,char[] second){

        char[] result = new char[first.length + second.length];
        int resultTracker=0;
        for(int i = 0; i<first.length; i++){
            result[resultTracker++]= first[i];
        }
        for(int i = 0; i<second.length; i++){
            result[resultTracker++]= first[i];
        }

        return  result;
    }
}
