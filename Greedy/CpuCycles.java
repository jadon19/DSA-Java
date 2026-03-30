package Greedy;

class CpuCycles {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int[] cooldown = new int[26];
        
        for (char t : tasks) {
            freq[t - 'A']++;
        }
        
        int time = 0;
        
        while (true) {
            int maxIdx = -1;
            
            // pick highest freq task with cooldown 0
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0 && cooldown[i] == 0) {
                    if (maxIdx == -1 || freq[i] > freq[maxIdx]) {
                        maxIdx = i;
                    }
                }
            }
            
            // execute task if available
            if (maxIdx != -1) {
                freq[maxIdx]--;
                cooldown[maxIdx] = n;
            }
            
            // decrease cooldown for all
            for (int i = 0; i < 26; i++) {
                if (cooldown[i] > 0) {
                    cooldown[i]--;
                }
            }
            
            time++;
            
            // check if all tasks done
            boolean done = true;
            for (int f : freq) {
                if (f > 0) {
                    done = false;
                    break;
                }
            }
            
            if (done) break;
        }
        
        return time;
    }
}
