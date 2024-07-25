// Copyright 2024 The JSpecify Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Test case for Issue 164:
// https://github.com/jspecify/jspecify-reference-checker/issues/164

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
class Issue164More {
  interface Super<T extends @Nullable Object> {
    <U extends T> void foo(Lib<? extends U> lib);
  }

  interface Sub<V extends @Nullable Object> extends Super<V> {
    <W extends V> void foo(Lib<? extends W> lib);
  }

  interface Lib<X extends @Nullable Object> {}
}