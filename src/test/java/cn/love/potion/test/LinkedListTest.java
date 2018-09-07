/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.love.potion.test;

import java.util.*;

/**
 * @author cicicc
 * @since 0.0.1
 */
public class LinkedListTest {
   private static List<Integer> list = new LinkedList<>();
    public static void main(String[] args) {
        addElement();
        ListIterator<Integer> iterator = list.listIterator(90000);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    private static void addElement() {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            list.add(random.nextInt());
        }
    }
}
