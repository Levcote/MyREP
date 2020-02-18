package com.company;

public class Computer  {
    class GraphicsCard{

    }

    class Processor{
        private boolean IsAnalysis =false;
        private boolean isStart = false;
        public void start(){
            isStart=true;
            System.out.println("IsStart.Processor = "+isStart);
        }
        public void shutdown(){
            isStart =false;
            System.out.println("Shutdown.Processor = "+isStart);
        }
        public void Dat_analysis(){
            IsAnalysis=true;
            System.out.println("Your investments is  working");
        }

    }
    class RAM{
        private boolean isStart = false;
        public void start(){
            isStart=true;
            System.out.println("IsStart.RAM = "+isStart);
        }

        public void shutdown(){
            isStart =false;
            System.out.println("Shutdown.RAW = "+isStart);
        }
        private boolean IsAnalysis =false;
        public void Dat_analysis(){
          IsAnalysis=true;
          System.out.println("Your investments is  working");
        }
    }

    Processor i5 = new Processor();
    RAM transfer = new RAM();
    Processor i9 = new Processor();
    RAM XXX = new RAM();
    GraphicsCard GTX_2080_ti = new GraphicsCard();
}
