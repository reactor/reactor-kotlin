/*
 * Copyright (c) 2011-2021 VMware Inc. or its affiliates, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package reactor.kotlin.extra.bool

import reactor.bool.BooleanUtils
import reactor.core.publisher.Mono

/**
 * Extension to logically revert a [Boolean] [Mono]. It can also be
 * applied as a ! operator.
 *
 * @author Simon Baslé
 * @since 3.2.0
 */
operator fun Mono<Boolean>.not(): Mono<Boolean> = BooleanUtils.not(this)

/**
 * Extension to logically combine two [Boolean] [Mono] with the AND operator.
 *
 * @author Simon Baslé
 * @since 3.2.0
 */
fun Mono<Boolean>.logicalAnd(rightHand: Mono<Boolean>): Mono<Boolean> = BooleanUtils.and(this, rightHand)

/**
 * Extension to logically combine two [Boolean] [Mono] with the Not-AND (NAND) operator.
 *
 * @author Simon Baslé
 * @since 3.2.0
 */
fun Mono<Boolean>.logicalNAnd(rightHand: Mono<Boolean>): Mono<Boolean> = BooleanUtils.nand(this, rightHand)

/**
 * Extension to logically combine two [Boolean] [Mono] with the OR operator.
 *
 * @author Simon Baslé
 * @since 3.2.0
 */
fun Mono<Boolean>.logicalOr(rightHand: Mono<Boolean>): Mono<Boolean> = BooleanUtils.or(this, rightHand)

/**
 * Extension to logically combine two [Boolean] [Mono] with the Not-OR (NOR) operator.
 *
 * @author Simon Baslé
 * @since 3.2.0
 */
fun Mono<Boolean>.logicalNOr(rightHand: Mono<Boolean>): Mono<Boolean> = BooleanUtils.nor(this, rightHand)

/**
 * Extension to logically combine two [Boolean] [Mono] with the exclusive-OR (XOR) operator.
 *
 * @author Simon Baslé
 * @since 3.2.0
 */
fun Mono<Boolean>.logicalXOr(rightHand: Mono<Boolean>): Mono<Boolean> = BooleanUtils.xor(this, rightHand)