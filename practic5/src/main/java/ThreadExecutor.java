public class ThreadExecutor extends Thread {
    private Account account;
    private boolean firstIsWork = true;
    private boolean secondIsWork = true;
    private boolean thirdIsWork = true;

    public ThreadExecutor() {
    }

    public void showAccountFilling(long millis) throws Exception {
        account = new Account(0);


        Thread firstThread = new Thread(() -> {
            System.out.println( Thread.currentThread().getName() + " has started working");

            while (firstIsWork) {
                try {
                    account.addToBalance(20);
                    Thread.sleep(2);

                } catch (Exception ex) {
                    System.out.println("Error");
                }
            }
            System.out.println( Thread.currentThread().getName() + " has finished");
        });

        Thread secondThread = new Thread(() -> {
            System.out.println( Thread.currentThread().getName() + " has started working");

            while (secondIsWork) {
                try {
                    account.addToBalance(-25);
                    Thread.sleep(2);

                } catch (Exception ex) {
                    System.out.println("Error");
                }
            }
            System.out.println( Thread.currentThread().getName() + " has finished");
        });

        Thread thirdThread = new Thread(() -> {
            System.out.println( Thread.currentThread().getName() + " has started working");

            while (thirdIsWork) {
                try {
                    account.addToBalance(5);
                    Thread.sleep(2);

                } catch (Exception ex) {
                    System.out.println("Error");
                }
            }
            System.out.println( Thread.currentThread().getName() + " has finished");
        });

        firstThread.start();
        secondThread.start();
        thirdThread.start();



        Thread.sleep(millis);

        firstIsWork = false;
        secondIsWork = false;
        thirdIsWork = false;
        firstThread.join();
        secondThread.join();
        thirdThread.join();

        System.out.println(account.toString());

        }


    }


