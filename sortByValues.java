List<Map.Entry<Character,Integer>> list=new
                        LinkedList<Map.Entry<Character,Integer>>(map.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> e1, 
                               Map.Entry<Character,Integer> e2){
                return e2.getValue().compareTo(e1.getValue());
            } 
        });