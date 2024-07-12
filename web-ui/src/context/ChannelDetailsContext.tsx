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
import { TvChannelDetails } from '@/api/types/tv-channel';

type ChannelDetailsContextType = {
  details: TvChannelDetails;
};

const ChannelDetailsContext =
  React.createContext<ChannelDetailsContextType | null>(null);

type Props = {
  details: TvChannelDetails;
  children: React.ReactNode;
};

const ChannelDetailsProvider: React.FC<Props> = ({ details, children }) => (
  <ChannelDetailsContext.Provider value={{ details }}>
    {children}
  </ChannelDetailsContext.Provider>
);

export default ChannelDetailsProvider;