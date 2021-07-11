package com.example.quiz;

public class questions {

    public String[] mQuestions={
            "CANDOR",
            "ELOQUENT",
            "PETULANT",
            "REPUDIATE",
            "UBIQUITOUS",
            "TREACHEROUS",
            "NUANCE",
            "IRRECONCILABLE",
            "IGNOMINIOUS",
            "ENTRENCHED"
    };

        private String mChoices[][]={
                {"A","B","C","D"},
                {"A","B","C","D"},
                {"A","B","C","D"},
                {"A","B","C","D"},
                {"A","B","C","D"},
                {"A","B","C","D"},
                {"A","B","C","D"},
                {"A","B","C","D"},
                {"A","B","C","D"},
                {"A","B","C","D"}
        };

        private String mCorrectAnswer[]={"A","A","A","A","A","A","A","A","A","A"};

        public String getQuestion(int a)
        {
            String question=mQuestions[a];
            return question;
        }

        public String getChoice1(int a)
        {
            String  choice=mChoices[a][0];
            return choice;
        }
        public String getChoice2(int a)
        {
            String  choice=mChoices[a][1];
            return choice;
        }
        public String getChoice3(int a)
        {
            String  choice=mChoices[a][2];
            return choice;
        }
        public String getChoice4(int a)
        {
            String  choice=mChoices[a][3];
            return choice;
        }

        public String getCorrectAnswer(int a)
        {
            String  answer=mCorrectAnswer[a];
            return answer;
        }
}
