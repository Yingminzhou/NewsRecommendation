package com.giiso.zym.seg;

import java.util.List;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;

public class TestAnsj {

	public static void main(String[] args){
		
		String words = "数据库的运行状态，健康情况都关系着我们应用的效率。本次在线讲座将从MongoDB的日常巡检展开，涉及troubleshooting、优化，并对执行计划进行分析，以便大家能对MongoDB的巡检，优化与执行计划分析有所了解。讲座之后会有10-15分钟问答时间，欢迎大家积极参与。";  
        List<Term> wordsList = ToAnalysis.parse(words);
        for(Term term: wordsList){
        	System.out.println(term.getName());
        }
		//System.out.println(ToAnalysis.parse(words));  
		
	}
	
}
