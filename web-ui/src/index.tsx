/*
 * Copyright (c) 2024 by Miłosz Gilga <https://miloszgilga.pl>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     <http://www.apache.org/licenses/LICENSE-2.0>
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import React from 'react';
import { SnackbarProvider } from 'notistack';
import ReactDOM from 'react-dom/client';
import AppRouter from '@/app/AppRouter';
import '@/index.css';
import { AxiosWrapper, QueryWrapper } from './api';

const appMount = document.getElementById('app-mount')!;

ReactDOM.createRoot(appMount).render(
  <React.StrictMode>
    <SnackbarProvider>
      <AxiosWrapper>
        <QueryWrapper>
          <AppRouter />
        </QueryWrapper>
      </AxiosWrapper>
    </SnackbarProvider>
  </React.StrictMode>
);