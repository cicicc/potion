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

/**
 * String类的一些操作
 * @author cicicc
 * @since 0.0.1
 */
public class StringTest {


    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hell";
        String s3 = s2 + "o";
        if (s1 == s3) {
            System.out.println("A");
        } else if (s1.equals(s3)) {
            System.out.println("B");
        }

    }
}
