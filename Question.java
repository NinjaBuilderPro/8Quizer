package com.eightquiz;
public class Question {
    String m_Question;
    String m_Answer;
    Question(String question, String answer) {
        m_Question = question;
        m_Answer = answer;
    }

    public String getAnswer() {
        return m_Answer;
    }

    public String getQuestion() {
        return m_Question;
    }

    public void setAnswer(String m_Answer) {
        this.m_Answer = m_Answer;
    }

    public void setQuestion(String m_Question) {
        this.m_Question = m_Question;
    }
}
