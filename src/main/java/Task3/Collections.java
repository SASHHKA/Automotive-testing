package Task3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Collections {
    public static void main(String[] args) {
        //Task1
        int a = 0;
        int b = 1;
        List list = new ArrayList(Arrays.asList(0,2,4,0,1,2,0,0));
        System.out.println(list);

        for(int i = 0; i< list.size()/2; i++) {
            if(list.get(i).equals(a)) {
                list.set(i, b);
            }
        }
        System.out.println(list);


        //Task2

        //a)

        List<List<Integer>> list2 = new ArrayList<>(Arrays.asList(
                Arrays.asList(1,1,4),
                Arrays.asList(2,2,3),
                Arrays.asList(3,4,5)
        ));
        for(int i=0; i <list2.size();i++){
            System.out.println();
            for(int j =0;j< list2.get(0).size();j++){
                System.out.print(list2.get(i).get(j)+" ");
            }
        }
        System.out.println("");

        for(int i=0; i <list2.size();i++){
            System.out.println();
            for(int j =0;j< list2.get(0).size();j++){
                System.out.print(list2.get(j).get(i)+" " + System.lineSeparator());
            }
        }
        System.out.println("");
        //b)

        List<List<Integer>> list3 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1, 6)),
                new ArrayList<>(Arrays.asList(2, 2, 1)),
                new ArrayList<>(Arrays.asList(7, 2, 6))
        ));

        Set<Integer> existingIntegers = new HashSet<>();

        list3.stream()
                .map((integers) -> integers.stream()
                        .filter((integer) -> {
                            if (existingIntegers.contains(integer)) {
                                return false;
                            }
                            existingIntegers.add(integer);
                            return true;
                        }).collect(Collectors.toList())
                ).forEach(System.out::println);

        //Task3

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum id laoreet turpis. Quisque efficitur diam in molestie tristique. Etiam rhoncus sapien ut felis molestie, at imperdiet lacus dapibus. Curabitur quis risus metus. Donec accumsan facilisis libero id pretium. Morbi sed ultricies justo. Donec eleifend auctor mi, at hendrerit mi vestibulum at. Curabitur facilisis, mauris at rutrum aliquam, orci ligula efficitur augue, eget lobortis tortor est in tellus. Praesent urna quam, sagittis sit amet elit nec, malesuada dignissim lectus. Sed vel massa sodales, consequat est ut, sodales orci. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Vestibulum dignissim at leo quis fermentum.\n" +
                "\n" +
                "Nam scelerisque vehicula nibh, a ultricies quam sodales et. Pellentesque laoreet efficitur urna, id venenatis lectus sagittis in. Cras et tincidunt diam, id lobortis elit. Suspendisse eu accumsan nulla. Proin elementum nisl eu sapien mollis tincidunt. Donec dignissim suscipit orci, eu finibus est accumsan in. Nam interdum augue sed semper porttitor. Aenean dictum augue vel ultricies fringilla.\n" +
                "\n" +
                "Sed purus lacus, pellentesque vitae lorem a, pellentesque convallis nisi. Aenean accumsan faucibus gravida. Suspendisse at elit eu est pretium blandit nec quis ante. Proin velit lorem, placerat in viverra vitae, molestie sit amet elit. Quisque rutrum aliquam tristique. Duis euismod neque felis, in malesuada nunc bibendum facilisis. Phasellus ac est sodales, iaculis urna sed, consectetur ipsum. Donec eros mi, hendrerit quis odio vel, fringilla fringilla lacus. Integer consectetur dui lectus, sed congue nisi malesuada eu. Nullam commodo enim sit amet ante efficitur varius. Quisque et purus augue. Maecenas vehicula in nisl id molestie. Nulla ligula neque, faucibus eget lectus ac, porttitor sagittis ex. Cras quam ex, pulvinar at leo ut, vestibulum elementum diam. Nullam efficitur lacus ut risus congue, sollicitudin semper est consectetur. Praesent accumsan lectus et ante pulvinar, vitae lobortis est aliquet.\n" +
                "\n" +
                "In eleifend odio eget purus mattis sagittis. Nunc interdum id tortor sit amet volutpat. Nam eu consectetur nisi, eget tempor nisl. In pretium elit a erat porttitor faucibus et quis lacus. Praesent suscipit dignissim nunc, id iaculis lectus dapibus ac. Proin metus tortor, feugiat ac posuere in, cursus et quam. Maecenas feugiat orci vitae orci imperdiet, eget venenatis lacus pretium.\n" +
                "\n" +
                "Aliquam vel ultrices felis, a vehicula felis. Suspendisse vitae nibh ut elit placerat faucibus. Sed accumsan metus id mauris egestas, a aliquet justo mattis. Duis vel lectus pretium, consequat turpis quis, accumsan dui. Donec viverra auctor quam. Cras vehicula lacus in neque tempor, nec tincidunt velit porta. Nullam scelerisque fermentum leo, sed bibendum ligula venenatis non. Sed vehicula, velit ut varius elementum, tellus dui bibendum odio, nec iaculis libero lacus quis ante. Curabitur ante neque, lacinia ac elit nec, fermentum rutrum felis. Donec in felis velit. Phasellus suscipit pretium lobortis. Integer condimentum felis vitae ornare ultrices. Integer gravida sollicitudin malesuada. Nullam vitae bibendum massa. Quisque quis mauris imperdiet, malesuada ante ut, mollis neque. Nullam suscipit, ex ut feugiat vulputate, mi nulla vehicula arcu, ac facilisis odio erat in massa.\n" +
                "\n" +
                "Maecenas pulvinar, augue in tempus interdum, turpis augue maximus velit, in pretium erat urna eu turpis. Nullam bibendum, turpis vel feugiat cursus, neque sapien imperdiet sem, quis molestie tortor tortor id metus. Donec sagittis metus sit amet enim ultricies, nec imperdiet ipsum laoreet. Nullam lacus nisi, congue id nibh vel, hendrerit rutrum sem. Integer imperdiet lectus velit, eu suscipit sapien condimentum sit amet. Morbi vel elit a magna pellentesque euismod vitae at dolor. In tincidunt mi at eros varius blandit. Vivamus vulputate ac est et sodales. Ut bibendum eu turpis ac pellentesque.\n" +
                "\n" +
                "Suspendisse pharetra tincidunt leo mollis laoreet. Aenean sed malesuada lectus. Ut scelerisque vehicula aliquam. Integer condimentum molestie metus. Donec velit enim, tempus at odio condimentum, aliquet lacinia odio. Morbi et nunc vitae justo gravida porta. Donec porta efficitur mi, et malesuada enim tincidunt rutrum. Vivamus lorem mauris, accumsan sit amet mauris in, blandit tristique tortor. Proin suscipit metus ante, ac ultricies erat porttitor non. Suspendisse potenti. In at velit vehicula, aliquam orci ut, congue justo. Nunc sit amet arcu iaculis, mattis mi tincidunt, auctor leo. Nam non nisl felis.\n" +
                "\n" +
                "Suspendisse nec fermentum nibh. Sed vel sapien quis eros vulputate pretium. Ut dapibus id ex vitae gravida. Maecenas ac ullamcorper lectus. Quisque vulputate elit velit, a eleifend enim ornare quis. Praesent consequat lorem quis erat dignissim, at consectetur est tempus. Vestibulum egestas mauris at velit ultrices porta. Donec a velit mi. Nullam dapibus, lacus non eleifend porttitor, lectus velit porttitor lorem, ut dignissim ligula mi eget lacus. Maecenas quam erat, laoreet et condimentum nec, laoreet ut felis. Nulla consequat lectus eu dignissim porttitor.\n" +
                "\n" +
                "Quisque eget dapibus velit, ac fringilla dui. Praesent et justo posuere eros condimentum porttitor. Duis quam odio, sollicitudin non nulla ac, ultrices finibus est. Aenean tincidunt massa nisl, id consequat purus fringilla ut. Sed quis risus quis leo accumsan porta. Phasellus commodo, nulla vitae semper luctus, neque nisi auctor nibh, vitae fermentum diam ligula ut eros. Donec finibus ut est vel finibus. Etiam congue eget turpis euismod tempor. Aliquam mattis nibh vel justo rutrum malesuada. Sed at viverra neque. Fusce est magna, molestie sed molestie eget, porttitor sit amet erat. Fusce ullamcorper eu diam in lacinia. Donec a dictum ligula. Sed metus est, sollicitudin a dui ut, molestie rhoncus sapien. Suspendisse ut ipsum ex. Nam arcu leo, porttitor vitae accumsan sed, mattis pulvinar risus.\n" +
                "\n" +
                "Pellentesque dictum, erat non auctor volutpat, dolor justo eleifend ipsum, vel accumsan purus dolor id lorem. Cras et ante porta, sollicitudin erat quis, semper orci. Integer suscipit quam erat, at iaculis tellus porttitor et. Nullam vitae fringilla turpis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec ex lorem, cursus nec sem eget, lacinia vehicula enim. Vivamus scelerisque molestie ipsum, a vehicula nulla viverra cursus. Nulla convallis massa euismod, molestie lectus id, tincidunt sem.\n" +
                "\n" +
                "Curabitur ultricies ullamcorper nunc id luctus. Etiam vulputate posuere libero, eget feugiat libero vestibulum eu. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Pellentesque placerat ligula et nisl euismod, ac molestie sapien hendrerit. Sed risus nisi, varius eu sem a, commodo malesuada.";

        Map<String, Integer> result = new HashMap<>();
        List<String> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher(text);

        while(matcher.find()) {
            words.add(matcher.group());
        }
        for (String word : words) {
            String firstLetter = String.valueOf(word.charAt(0));
            result.putIfAbsent(firstLetter, 0);
            int amount = result.get(firstLetter);
            result.put(firstLetter, amount + 1);
        }
        System.out.println(result);
    }
}
