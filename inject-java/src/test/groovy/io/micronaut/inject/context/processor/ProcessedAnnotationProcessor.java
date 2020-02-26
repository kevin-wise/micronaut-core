/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.inject.context.processor;

import io.micronaut.context.BeanContext;
import io.micronaut.context.annotation.Context;
import io.micronaut.context.processor.BeanDefinitionProcessor;
import io.micronaut.inject.BeanDefinition;

import java.util.HashSet;
import java.util.Set;

@Context
public class ProcessedAnnotationProcessor implements BeanDefinitionProcessor<ProcessedAnnotation> {
    private Set<BeanDefinition<?>> beans = new HashSet<>();

    public ProcessedAnnotationProcessor() {
        System.out.println("Starting");
    }

    @Override
    public void process(BeanDefinition<?> beanDefinition, BeanContext object) {
        beans.add(beanDefinition);
    }

    public Set<BeanDefinition<?>> getBeans() {
        return beans;
    }
}
