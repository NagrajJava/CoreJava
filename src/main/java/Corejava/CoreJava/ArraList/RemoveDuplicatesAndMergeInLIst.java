package Corejava.CoreJava.ArraList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesAndMergeInLIst {

	public static void main(String[] args) {
		List<String> listone = new ArrayList<String>(Arrays.asList("nagraj","Ramu","Badra","Mahesh","subba"));
		List<String> listTwo = new ArrayList<String>(Arrays.asList("nagraj","rakesh","bendra","shivaraj","arya"));
		
		          List<String> withoutduplicates = listone.stream().distinct().collect(Collectors.toList());
		          System.out.println(withoutduplicates);
		      List<String> mixedelements =  Stream.of(listone,listTwo).flatMap( x ->x.stream()).distinct().collect(Collectors.toList());
		
                             System.out.println(mixedelements);
	}

}
